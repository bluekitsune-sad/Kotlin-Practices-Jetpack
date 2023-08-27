package com.example.shoppingmart.ui.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shoppingmart.Graph
import com.example.shoppingmart.data.room.ItemsWithStoreAndList
import com.example.shoppingmart.data.room.models.Item
import com.example.shoppingmart.ui.Category
import com.example.shoppingmart.ui.repository.Repository
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: Repository = Graph.repository
): ViewModel() {
    var state by mutableStateOf(HomeState())
        private set

    init {
        getItems()
    }

    private fun getItems(){
        viewModelScope.launch {
            repository.getItemsWithListAndStore.collectLatest {
                state = state.copy(
                    items = it
                )
            }
        }
    }
    fun deleteItem(item: Item){
        viewModelScope.launch {
            repository.deleteItem(item)
        }
    }
    fun onCategoryChange(category: Category){
        state = state.copy(category = category)
        filterBy(category.id)
    }
    fun onItemCheckedChange(item: Item , isChecked:Boolean){
        viewModelScope.launch {
            repository.updateItem(
                item = item.copy(isCheck = isChecked)
            )
        }
    }
    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()
    fun refreshDataFromDatabase() {
        viewModelScope.launch {
            _isLoading.value = true
            delay(3000L)
            getItems() //
            _isLoading.value = false
        }

    }
    private fun filterBy(shoppingListId: Int){
        if(shoppingListId != 10001){
            viewModelScope.launch {
                repository.getItemWithStoreAndListFilteredById(
                    shoppingListId
                ).collectLatest {
                    state = state.copy(items = it)
                }
            }
        }else{
            getItems()
        }
    }
}

data class HomeState(
    val items: List<ItemsWithStoreAndList> = emptyList(),
    val category: Category = Category(),
    val itemChecked: Boolean = false
)