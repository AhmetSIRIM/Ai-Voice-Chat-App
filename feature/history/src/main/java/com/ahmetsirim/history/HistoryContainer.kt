package com.ahmetsirim.history

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun HistoryContainer(
    navigateUp: () -> Unit,
    navigateToChat: (String?) -> Unit
) {
    val viewModel: HistoryViewModel = hiltViewModel()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    HistoryScreen(
        uiState = uiState,
        onEvent = { viewModel.onEvent(it) },
        navigateUp = { navigateUp() },
        navigateToChat = { navigateToChat(it) }
    )
}
