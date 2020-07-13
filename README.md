## @AngularKt
> Write Angular apps with pleasure on Kotlin

Benefits:
* Kotlin itself
* Fully customizable webpack
* Support of [Coroutines](https://github.com/Kotlin/kotlinx.coroutines)
* Support of [Multiplatform Projects](https://kotlinlang.org/docs/reference/multiplatform.html)
* Support of [Ktor](https://ktor.io) asynchronous web framework
* Support of [multiplatform / multi-format reflectionless serialization](https://github.com/Kotlin/kotlinx.serialization)
* Fully customizable CLI

### Quick example
```
@Component(
    selector = "app-root",
    template = """
        <p>
          Welcome to {{title}}!
        </p>
    """,
    styles = []
)
class AppComponent : OnInit {

    var title = "example"
  
    override fun ngOnInit() {
    }
}

@NgModule
class AppModule {

    companion object : NgModuleKt(
        declarations = arrayOf(
            AppComponent::class.js
        ),
        imports = arrayOf(
            BrowserModule::class.js
        ),
        providers = emptyArray(),
        bootstrap = arrayOf(AppComponent::class.js)
    )
}

fun main() {
    AngularKt.bootstrap<AppModule>()
}
```

### CLI
```
$ sh gradlew generate service --name=app
```

### Develop
Sorry, tools are available only for Linux (may be also MacOS)  
First you need to setup environment
```
$ bash tools/setup.sh
$ bash tools/build.sh
```

### Contribute
All issues and pull requests are welcome.  
If you need an idea, look for `// todo` comments in code  
Thank you in advance

### Thanks
Special thanks these guys. Awesome job!
* [MpApt - Kotlin (Native/JS/JVM) Annotation Processor library by @Foso](https://github.com/Foso/MpApt)
* [Kotling Angular by @Yegair](https://github.com/Yegair/kotlin-angular)
* [Angular-Kotlin Starter App by @gbaldeck](https://github.com/gbaldeck/angular-kotlin-starter)

### License
