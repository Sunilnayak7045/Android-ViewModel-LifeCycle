 ViewModelFactroy is used to pass some input data to the ViewModel constructor.


In build.gradle file

    // ViewModel dependencies
    def lifecycle_version = "2.5.0-alpha04"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    
    
android {
.
.
.
       kotlinOptions {
            freeCompilerArgs += [
                    "-Xjvm-default=all",
            ]
        }

}
