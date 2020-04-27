package com.bialasn.baseproject.base

import androidx.lifecycle.ViewModel
import com.bialasn.baseproject.injection.NetworkModule
import com.bialasn.baseproject.injection.component.DaggerViewModelInjector
import com.bialasn.baseproject.injection.component.ViewModelInjector
import com.bialasn.baseproject.ui.post.PostListViewModel

abstract class BaseViewModel:ViewModel(){
 private val injector: ViewModelInjector = DaggerViewModelInjector
  .builder()
  .networkModule(NetworkModule)
  .build()

 init {
  inject()
 }

 private fun inject() {
  when (this) {
   is PostListViewModel -> injector.inject(this)
  }
 }
}