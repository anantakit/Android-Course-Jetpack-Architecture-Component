# Android-Course-Jetpack-Architecture-Component

### 1.BindingDemo1 (basic dataBinding project)
##### STEP
 - enable databinding
 - wrap xml with layout tag
 - eliminate findViewById() with dataBinding

### 2.BindingDemo2 (dataBinding challenge)
### 3.BindingDemo3 (send data object to xml display with databinding)
### 4.ViewModelDemo1 (viewmodel can store data after configuration changed like rotation,... )
##### STEP
 - add dependency lifecycle-viewmodel,  lifecycle_version [more detail](https://developer.android.com/jetpack/androidx/releases/lifecycle)
 - create viewModelClass
 - implement viewModel in Activity
 ```
  // define
  private lateinit var viewModel: MainActivityViewModel
  
  // in onCreate() set viewModelClass
  viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
 ```
