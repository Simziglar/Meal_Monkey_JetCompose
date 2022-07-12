package com.example.mealmonkeyjetcompose.navigation

enum class MealMonkeyScreens {
    SplashScreen,
    IntroScreen,
    HomeScreen;

    companion object{
        fun fromRoute(route: String?): MealMonkeyScreens
                    = when (route?.substringBefore("/")){

                        SplashScreen.name -> SplashScreen
                        IntroScreen.name -> IntroScreen
            null -> SplashScreen
            else -> {
                throw IllegalArgumentException("Route $route is not Recognised")
            }


        }
    }


}