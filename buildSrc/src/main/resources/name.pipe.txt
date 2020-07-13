import at.angular.core.PipeTransform
import at.angular.lib.Pipe

@Pipe(
    name = "myName"
)
class Pipe : PipeTransform {

    override fun transform(value: Any?, vararg args: Any?): Any? {
        return null
    }
}