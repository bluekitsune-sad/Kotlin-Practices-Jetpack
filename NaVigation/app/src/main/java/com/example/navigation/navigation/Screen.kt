package com.example.navigation.navigation

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY_2 = "name"

const val AUTHENTICATION_ROUTE = "authentication"
const val ROOT_ROUTE = "root"
const val HOME_ROUTE = "home"

sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object Login: Screen(route = "Login_screen")
    object Signin: Screen(route = "Signin_screen")

//    object Detail: Screen(route = "detail_screen/{id}") // the '/' is for "Required Arguments";
//    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY_2}"){    // the '/' is for required Arguments;
////        fun passId(id: Int): String{
//////            return "detail_screen/$id"
////            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
////        }
//        fun passNameAndId(
//            id: Int,
//            name: String
//        ):String{
//            return "detail_screen/$id/$name"
//        }
//    }
//}
 object Detail: Screen(route = "detail_screen?id={id}?name={name}"){    // the '?' is for "Optional Arguments";
    fun passNameAndId(id: Int = 0, name: String = "Saad Yousuf"): String {

            return "detail_screen?$id&$name"    //we add & in between query
        }
    }
}
