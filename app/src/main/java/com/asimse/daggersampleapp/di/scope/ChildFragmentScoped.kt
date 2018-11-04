package com.asimse.daggersampleapp.di.scope

import javax.inject.Scope

/**
 * Created by Syed Asim Ali on 04-Nov-18.
 */

@Scope
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class ChildFragmentScoped

