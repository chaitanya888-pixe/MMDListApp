package com.sample.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sample.domain.model.NewsInfo
import com.sample.domain.usecase.GetNewsListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val usersUseCase: GetNewsListUseCase) :
    ViewModel() {
    var isLoading by mutableStateOf(false)
    private val _newsList = MutableStateFlow<List<NewsInfo>>(emptyList())
    var newsList = _newsList.asStateFlow()


    private val _selectedNews = MutableStateFlow<NewsInfo?>(null)
    val selectedNews: StateFlow<NewsInfo?> = _selectedNews

    fun setSelectedUser(newsInfo: NewsInfo) {
        _selectedNews.value = newsInfo
    }

    fun fetchData() {
        isLoading = true

        viewModelScope.launch {
            usersUseCase.getListUsers().collectLatest { result ->
                result.onSuccess {
                    _newsList.value = it
                    isLoading = false

                }
                result.onFailure {
                    _newsList.value = emptyList()
                    isLoading = false

                }
            }
        }

    }



}