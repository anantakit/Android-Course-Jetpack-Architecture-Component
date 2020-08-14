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
 ### 5. ViewModelDemo2 (viewmodel factory for define startervalue and learn livedata)
  - LiveData คือ Class ที่เก็บข้อมูลต่างๆ ที่ทำงานร่วมกับ Lifecycle ของ Activity/Fragment/ Service และมีลักษณะการทำงานเป็น Observer ที่คอยสังเกตการณ์การเปลี่ยนแปลงของข้อมูล 
  - Mutable LiveData ก็เหมือนกับ LiveData ยกเว้นความสามารถในการแปลงร่าง (Mutant) [ตัว Live Data ไม่มี Method setter สำหรับ Value] และสามารถทำ data binding กับ View ได้อีกด้วย วิธีใช้มักจะใช้คู่กับ Service ViewModel และ Binding [เพิ่มเติม](https://medium.com/ta-tonthongkam/%E0%B8%A1%E0%B8%B2%E0%B9%83%E0%B8%8A%E0%B9%89-android-architecture-components-%E0%B8%81%E0%B8%B1%E0%B8%99%E0%B9%80%E0%B8%96%E0%B8%AD%E0%B8%B0-23811a9b4c31)
 ### 6. LiveData (livedata challenge)
