package com.example.a512lasalleapp.ui.utils

sealed class Screens(val route : String) {
    data object Home : Screens("home")
    data object Grades : Screens("grades")
    data object Calendar : Screens("calendar")
    data object Settings : Screens("settings")
    data object NewsDetail: Screens("news-detail")
    data object  Pagos : Screens("pagos")
    data object Changepassword : Screens("changepassword")
    data object SubjectDetails : Screens("subjectdetails")
    data object ChangeTheme : Screens("changetheme")
}