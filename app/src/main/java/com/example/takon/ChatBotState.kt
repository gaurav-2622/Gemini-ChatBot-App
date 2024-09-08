package com.example.takon

sealed interface ChatBotUiState {

    data object ideal :ChatBotUiState

    data object loading :ChatBotUiState

    data class Success (val ChatData :String) :ChatBotUiState

    data class Error (val message :String) :ChatBotUiState
}
