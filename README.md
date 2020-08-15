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
 ### 7. ViewModelWithDataBindingDemo1
  binding viewmodel กับหน้า ui ตรงๆ เ่ช่น ไม่ผ่านการ setText ใน MainActivity.kt
 ##### STEP
  - เพิ่ม data ใน activity_main.xml 
  - แก้ไข android:text ให้อยู่ในรูปแบบของ databindind expression เช้น android:text="@{viewmodel.sometext}" (สามารถแปลง Int -> String ได้ String.valueOf(someInt))
  - เพิ่ม event onclick ให้กับปุ่ม เช่น android:onClick="@{() -> viewModel.updateCount()}"
  - ลบ event listener ของปุ่มใน MainActivity.kt เพราะว่าจาก step ที่แล้วเราได้ bind event ตรงๆไปแล้ว
  - เพิ่ม binding.lifecycleOwner = this
  - เพิ่ม binding.myViewModel = viewModel เพิ่อ set ค่าให้กับ data myViewModel ในไฟล์ layout
### 8. TwoWayDataBindingDemo1
##### STEP 
  - เพิ่ม dependency ใน gradle.build 
    ```
     def lifecycle_version = "2.2.0"
      implementation "androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version"
      implementation "androidx.lifecycle:lifecycle-livedata:$lifecycle_version"
    ```
  - เพิ่ม apply plugin: 'kotlin-kapt' เพิ่อให้เราสามารถใข้ anotation ใน Kotlin ได้
  - ใน editText ให้แก้ databinding expression จากปกติ @{viewModel.username] เป็น @={viewModel.username}
  - เพิ่ม @Bindable ให้กับตัวแปร livedata ที่ต้องการจะให้เป็น 2 wayDataBinding ในไฟล์ MainActivityViewModel.kt
### 9.TwoWayDataBindingDemo2 (ใช้ ViewModelDemo2 เป็น starter project)
##### challenge 
  - ลด code observe data และ onclick listener ใน MainActivity.ky ใช้ความรู้จากการทำ twoway databinding
