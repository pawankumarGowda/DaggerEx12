package com.example.daggerex12;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

@Component (modules = DriverModule.class)
@Singleton
public interface AppComponent {
    //factory method
    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory
    interface Factory{
        AppComponent create(DriverModule driverModule);
    }

}
