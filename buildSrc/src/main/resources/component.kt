import at.angular.core.OnInit
import at.angular.lib.Component

@Component(
    selector = "prefix-name",
    template = """
      <p>
        name works!
      </p>
    """,
    styleUrls = []
)
class Component : OnInit {

    override fun ngOnInit() {
    }
}