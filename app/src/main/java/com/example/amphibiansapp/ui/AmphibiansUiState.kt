package com.example.amphibiansapp.ui

import com.example.amphibiansapp.network.Amphibian

sealed interface AmphibiansUiState {
    data class Success(val amphibians: List<Amphibian>) : AmphibiansUiState
    object Error : AmphibiansUiState
    object Loading : AmphibiansUiState
}