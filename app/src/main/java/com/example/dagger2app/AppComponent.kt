package com.example.dagger2app

import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [AppModule::class])
interface AppComponent {
    fun computer(): Computer
    fun inject(mainActivity: MainActivity)
}

@Module
object AppModule {
    @Provides
    fun provideComputer(
        processor: Processor,
        ram: Ram,
        motherCard: MotherCard
        ): Computer {
        return Computer(
            processor = processor,
            ram = ram,
            motherCard = motherCard
        )
    }

    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provideRam(): Ram {
        return Ram()
    }

    @Provides
    fun provideMotherCard(): MotherCard {
        return MotherCard()
    }
}