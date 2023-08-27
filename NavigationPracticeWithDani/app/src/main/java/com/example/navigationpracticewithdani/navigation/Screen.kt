package com.example.navigationpracticewithdani.navigation

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY_2 = "name"

const val AUTHENTICATION_ROUTE = "authentication"
const val ROOT_ROUTE = "root"
const val HOME_ROUTE = "home"

sealed class Screen(val route: String){
    object AHome: Screen(route = "Ahome_screen")
    object Login: Screen(route = "Login_screen")
    object Signin: Screen(route = "Signin_screen")

    object Home: Screen(route = "home_screen")
    object Inner1: Screen(route = "Inner1")
    object Inner2: Screen(route = "Inner2")
    object Inner1_1: Screen(route = "Inner1.1")
    object Inner1_2: Screen(route = "Inner1.2")
    object Inner2_1: Screen(route = "Inner2.1")
    object Inner2_2: Screen(route = "Inner2.2")
    object Inner1_1_1: Screen(route = "Inner1.1.1")
    object Inner1_1_2: Screen(route = "Inner1.1.2")
    object Inner1_2_1: Screen(route = "Inner1.2.1")
    object Inner1_2_2: Screen(route = "Inner1.2.2")
    object Inner2_1_1: Screen(route = "Inner2.1.1")
    object Inner2_1_2: Screen(route = "Inner2.1.2")
    object Inner2_2_1: Screen(route = "Inner2.2.1")
    object Inner2_2_2: Screen(route = "Inner2.2.2")


//        object Detail: Screen(route = "detail_screen/{id}") // the '/' is for "Required Arguments";
//    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY_2}"){    // the '/' is for required Arguments;
//        fun passId(id: Int): String{
//            return "detail_screen/$id"
//            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
//        }
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
