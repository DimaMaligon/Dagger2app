The simple example of dagger2 working. The class AppComponent is provide DI for this application.
@Component - is responsible for managing Modules. Properties in Component allow 
modules to be added to Components.
@Module - is a simple factory pattern, the methods in Module are to create the 
corresponding class instance method.
@Provides - provides methods in the Module class. It Provides methods for instance objects that
the Module can provide to the outside world,