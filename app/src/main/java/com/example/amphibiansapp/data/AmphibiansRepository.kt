package com.example.amphibiansapp.data

import com.example.amphibiansapp.network.Amphibian
import com.example.amphibiansapp.network.AmphibiansApiService

interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibian>
}

class NetworkAmphibiansRepository(
    private val apiService: AmphibiansApiService
) : AmphibiansRepository {

    override suspend fun getAmphibians(): List<Amphibian> {
        return apiService.getAmphibians()
    }
}