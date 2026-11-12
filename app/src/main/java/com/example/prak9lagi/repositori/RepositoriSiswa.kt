package com.example.prak9lagi.repositori

import com.example.prak9lagi.room.Siswa
import com.example.prak9lagi.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}