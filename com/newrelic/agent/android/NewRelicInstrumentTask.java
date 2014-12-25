// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NewRelicInstrumentTask.groovy

package com.newrelic.agent.android;

import groovy.lang.Closure;
import groovy.lang.MetaClass;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.Set;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.*;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.*;
import org.gradle.api.internal.AbstractTask;
import org.gradle.api.internal.tasks.TaskStateInternal;
import org.gradle.api.internal.tasks.execution.TaskValidator;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.specs.Spec;
import org.gradle.api.tasks.*;
import org.gradle.internal.service.ServiceRegistry;
import org.gradle.logging.StandardOutputCapture;

// Referenced classes of package com.newrelic.agent.android:
//            NewRelicTask

public class NewRelicInstrumentTask extends NewRelicTask
{

    public NewRelicInstrumentTask()
    {
        CallSite acallsite[] = $getCallSiteArray();
    }

    public Object newRelicInstrumentTask()
    {
        CallSite acallsite[] = $getCallSiteArray();
        Object obj2;
        String extraArgs = (String)ScriptBytecodeAdapter.castToType(acallsite[0].call($get$$class$java$lang$System(), "NewRelic.AgentArgs"), $get$$class$java$lang$String());
        extraArgs;
        String encodedProjectRoot = (String)ScriptBytecodeAdapter.castToType(acallsite[1].call(acallsite[2].call($get$$class$com$google$common$io$BaseEncoding()), acallsite[3].call(acallsite[4].call(acallsite[5].call(acallsite[6].callGroovyObjectGetProperty(this))))), $get$$class$java$lang$String());
        encodedProjectRoot;
        String agentArgs = (String)ScriptBytecodeAdapter.castToType(acallsite[7].call("projectRoot=", encodedProjectRoot), $get$$class$java$lang$String());
        agentArgs;
        if(!BytecodeInterface8.isOrigZ() || __$stMC || BytecodeInterface8.disabledStandardMetaClass())
        {
            if(ScriptBytecodeAdapter.compareNotEqual(extraArgs, null))
            {
                Object obj = acallsite[8].call(acallsite[9].call(agentArgs, ";"), extraArgs);
                agentArgs = (String)ScriptBytecodeAdapter.castToType(obj, $get$$class$java$lang$String());
                obj;
            }
        } else
        if(ScriptBytecodeAdapter.compareNotEqual(extraArgs, null))
        {
            Object obj1 = acallsite[10].call(acallsite[11].call(agentArgs, ";"), extraArgs);
            agentArgs = (String)ScriptBytecodeAdapter.castToType(obj1, $get$$class$java$lang$String());
            obj1;
        }
        acallsite[12].call(acallsite[13].callGroovyObjectGetProperty(this), acallsite[14].call("[newrelic] Attaching to process ", acallsite[15].call(acallsite[16].callGroovyObjectGetProperty(this))));
        obj2 = acallsite[17].callCurrent(this, agentArgs);
        Exception exception1;
        try
        {
            return obj2;
        }
        // Misplaced declaration of an exception variable
        catch(Exception exception1)
        {
            Exception e = (Exception)exception1;
            acallsite[18].call(acallsite[19].callGroovyObjectGetProperty(this), "[newrelic] Error encountered while loading the New Relic agent", e);
            throw (Throwable)acallsite[20].callConstructor($get$$class$java$lang$RuntimeException(), e);
        }
        Exception exception;
        exception;
        throw exception;
    }

    public Object this$dist$invoke$4(String name, Object args)
    {
        CallSite acallsite[] = $getCallSiteArray();
        return ScriptBytecodeAdapter.invokeMethodOnCurrentN($get$$class$com$newrelic$agent$android$NewRelicInstrumentTask(), this, (String)ScriptBytecodeAdapter.castToType(new GStringImpl(new Object[] {
            name
        }, new String[] {
            "", ""
        }), $get$$class$java$lang$String()), ScriptBytecodeAdapter.despreadList(new Object[0], new Object[] {
            args
        }, new int[] {
            0
        }));
    }

    public void this$dist$set$4(String name, Object value)
    {
        CallSite acallsite[] = $getCallSiteArray();
        Object obj = value;
        ScriptBytecodeAdapter.setGroovyObjectField(obj, $get$$class$com$newrelic$agent$android$NewRelicInstrumentTask(), this, (String)ScriptBytecodeAdapter.castToType(new GStringImpl(new Object[] {
            name
        }, new String[] {
            "", ""
        }), $get$$class$java$lang$String()));
        Object _tmp = obj;
    }

    public Object this$dist$get$4(String name)
    {
        CallSite acallsite[] = $getCallSiteArray();
        return ScriptBytecodeAdapter.getGroovyObjectField($get$$class$com$newrelic$agent$android$NewRelicInstrumentTask(), this, (String)ScriptBytecodeAdapter.castToType(new GStringImpl(new Object[] {
            name
        }, new String[] {
            "", ""
        }), $get$$class$java$lang$String()));
    }

    protected MetaClass $getStaticMetaClass()
    {
        if(getClass() != $get$$class$com$newrelic$agent$android$NewRelicInstrumentTask())
            return ScriptBytecodeAdapter.initMetaClass(this);
        ClassInfo classinfo = $staticClassInfo;
        if(classinfo == null)
            $staticClassInfo = classinfo = ClassInfo.getClassInfo(getClass());
        return classinfo.getMetaClass();
    }

    public static void __$swapInit()
    {
        CallSite acallsite[] = $getCallSiteArray();
        $callSiteArray = null;
    }

    public void super$2$onlyIf(Spec spec)
    {
        super.onlyIf(spec);
    }

    public Object super$4$getJarFilePath()
    {
        return super.getJarFilePath();
    }

    public Object super$4$this$dist$get$3(String s)
    {
        return super.this$dist$get$3(s);
    }

    public int super$2$compareTo(Object obj)
    {
        return super.compareTo(obj);
    }

    public void super$2$setDependsOn(Iterable iterable)
    {
        super.setDependsOn(iterable);
    }

    public void super$2$setProject(Project project)
    {
        super.setProject(project);
    }

    public void super$4$this$dist$set$3(String s, Object obj)
    {
        super.this$dist$set$3(s, obj);
    }

    public TaskDependency super$2$getTaskDependencies()
    {
        return super.getTaskDependencies();
    }

    public TaskInputs super$2$getInputs()
    {
        return super.getInputs();
    }

    public void super$2$addValidator(TaskValidator taskvalidator)
    {
        super.addValidator(taskvalidator);
    }

    public Object super$4$injectAgent(String s)
    {
        return super.injectAgent(s);
    }

    public void super$4$setMetaClass(MetaClass metaclass)
    {
        super.setMetaClass(metaclass);
    }

    public void super$2$executeWithoutThrowingTaskFailure()
    {
        super.executeWithoutThrowingTaskFailure();
    }

    public boolean super$2$getDidWork()
    {
        return super.getDidWork();
    }

    public void super$2$setName(String s)
    {
        super.setName(s);
    }

    public Set super$2$getDependsOn()
    {
        return super.getDependsOn();
    }

    public void super$2$setDidWork(boolean flag)
    {
        super.setDidWork(flag);
    }

    public File super$2$getTemporaryDir()
    {
        return super.getTemporaryDir();
    }

    public StandardOutputCapture super$2$getStandardOutputCapture()
    {
        return super.getStandardOutputCapture();
    }

    public TaskState super$2$getState()
    {
        return super.getState();
    }

    public String super$2$getName()
    {
        return super.getName();
    }

    public TaskOutputs super$2$getOutputs()
    {
        return super.getOutputs();
    }

    public TaskStateInternal super$2$getStateInternal()
    {
        return super.getStateInternal();
    }

    public void super$2$setGroup(String s)
    {
        super.setGroup(s);
    }

    public void super$2$setOnlyIf(Spec spec)
    {
        super.setOnlyIf(spec);
    }

    public Task super$2$mustRunAfter(Object aobj[])
    {
        return super.mustRunAfter(aobj);
    }

    public ExtensionContainer super$2$getExtensions()
    {
        return super.getExtensions();
    }

    public void super$2$setMustRunAfter(Iterable iterable)
    {
        super.setMustRunAfter(iterable);
    }

    public boolean super$2$hasProperty(String s)
    {
        return super.hasProperty(s);
    }

    public Task super$2$doFirst(Closure closure)
    {
        return super.doFirst(closure);
    }

    public Task super$2$finalizedBy(Object aobj[])
    {
        return super.finalizedBy(aobj);
    }

    public Object super$2$property(String s)
    {
        return super.property(s);
    }

    public String super$2$toString()
    {
        return super.toString();
    }

    public Task super$2$doFirst(Action action)
    {
        return super.doFirst(action);
    }

    public void super$2$setDescription(String s)
    {
        super.setDescription(s);
    }

    public Task super$2$deleteAllActions()
    {
        return super.deleteAllActions();
    }

    public int super$2$compareTo(Task task)
    {
        return super.compareTo(task);
    }

    public Object super$4$getPid()
    {
        return super.getPid();
    }

    public void super$1$wait()
    {
        super.wait();
    }

    public void super$2$execute()
    {
        super.execute();
    }

    public MetaClass super$4$getMetaClass()
    {
        return super.getMetaClass();
    }

    public void super$2$onlyIf(Closure closure)
    {
        super.onlyIf(closure);
    }

    public void super$2$setOnlyIf(Closure closure)
    {
        super.setOnlyIf(closure);
    }

    public Task super$2$doLast(Closure closure)
    {
        return super.doLast(closure);
    }

    public Object super$4$invokeMethod(String s, Object obj)
    {
        return super.invokeMethod(s, obj);
    }

    public Object super$4$getProperty(String s)
    {
        return super.getProperty(s);
    }

    public Object super$4$this$dist$invoke$3(String s, Object obj)
    {
        return super.this$dist$invoke$3(s, obj);
    }

    public ServiceRegistry super$2$getServices()
    {
        return super.getServices();
    }

    public MetaClass super$4$$getStaticMetaClass()
    {
        return super.$getStaticMetaClass();
    }

    private static void $createCallSiteArray_1(String as[])
    {
        as[0] = "getProperty";
        as[1] = "encode";
        as[2] = "base64";
        as[3] = "getBytes";
        as[4] = "getCanonicalPath";
        as[5] = "getProjectDir";
        as[6] = "project";
        as[7] = "plus";
        as[8] = "plus";
        as[9] = "plus";
        as[10] = "plus";
        as[11] = "plus";
        as[12] = "info";
        as[13] = "logger";
        as[14] = "plus";
        as[15] = "toString";
        as[16] = "pid";
        as[17] = "injectAgent";
        as[18] = "error";
        as[19] = "logger";
        as[20] = "<$constructor$>";
    }

    private static CallSiteArray $createCallSiteArray()
    {
        String as[] = new String[21];
        $createCallSiteArray_1(as);
        return new CallSiteArray($get$$class$com$newrelic$agent$android$NewRelicInstrumentTask(), as);
    }

    private static CallSite[] $getCallSiteArray()
    {
        CallSiteArray callsitearray;
        if($callSiteArray == null || (callsitearray = (CallSiteArray)$callSiteArray.get()) == null)
        {
            callsitearray = $createCallSiteArray();
            $callSiteArray = new SoftReference(callsitearray);
        }
        return callsitearray.array;
    }

    private static Class $get$$class$java$lang$RuntimeException()
    {
        return $class$java$lang$RuntimeException == null && ($class$java$lang$RuntimeException = _mthclass$("java.lang.RuntimeException")) == null ? $class$java$lang$RuntimeException : $class$java$lang$RuntimeException;
    }

    private static Class $get$$class$java$lang$System()
    {
        return $class$java$lang$System == null && ($class$java$lang$System = _mthclass$("java.lang.System")) == null ? $class$java$lang$System : $class$java$lang$System;
    }

    private static Class $get$$class$com$newrelic$agent$android$NewRelicInstrumentTask()
    {
        return $class$com$newrelic$agent$android$NewRelicInstrumentTask == null && ($class$com$newrelic$agent$android$NewRelicInstrumentTask = _mthclass$("com.newrelic.agent.android.NewRelicInstrumentTask")) == null ? $class$com$newrelic$agent$android$NewRelicInstrumentTask : $class$com$newrelic$agent$android$NewRelicInstrumentTask;
    }

    private static Class $get$$class$java$lang$String()
    {
        return $class$java$lang$String == null && ($class$java$lang$String = _mthclass$("java.lang.String")) == null ? $class$java$lang$String : $class$java$lang$String;
    }

    private static Class $get$$class$com$google$common$io$BaseEncoding()
    {
        return $class$com$google$common$io$BaseEncoding == null && ($class$com$google$common$io$BaseEncoding = _mthclass$("com.google.common.io.BaseEncoding")) == null ? $class$com$google$common$io$BaseEncoding : $class$com$google$common$io$BaseEncoding;
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    private static ClassInfo $staticClassInfo;
    public static transient boolean __$stMC;
    public static long __timeStamp;
    public static long __timeStamp__239_neverHappen1416597642152;
    private static SoftReference $callSiteArray;
    private static Class $class$java$lang$RuntimeException;
    private static Class $class$java$lang$System;
    private static Class $class$com$newrelic$agent$android$NewRelicInstrumentTask;
    private static Class $class$java$lang$String;
    private static Class $class$com$google$common$io$BaseEncoding;

    static 
    {
        __$swapInit();
        Long long1 = (Long)DefaultTypeTransformation.box(0L);
        __timeStamp__239_neverHappen1416597642152 = long1.longValue();
        Long _tmp = long1;
        Long long2 = (Long)DefaultTypeTransformation.box(0x149d3cc9ba8L);
        __timeStamp = long2.longValue();
        Long _tmp1 = long2;
    }
}
