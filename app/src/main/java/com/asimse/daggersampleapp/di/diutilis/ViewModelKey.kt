package com.asimse.daggersampleapp.di.diutilis

import dagger.MapKey
import kotlin.reflect.KClass

/**
 * Created by Syed Asim Ali on 04-Nov-18.
 */

@MustBeDocumented
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
internal annotation class ViewModelKey(val value: KClass<out BaseViewModel>)


