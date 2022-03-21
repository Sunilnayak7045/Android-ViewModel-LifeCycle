
![viewmodel-lifecycle](https://user-images.githubusercontent.com/47368515/159261723-fd0c20d3-3705-4be3-acdf-5dd464d2112d.png)


The ViewModel remains in memory until the Lifecycle it's scoped to goes away permanently,
The ViewModel exists from when you first request a ViewModel until the activity is finished and destroyed.

 // ViewModel dependencies
 
    def lifecycle_version = "2.5.0-alpha04"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
