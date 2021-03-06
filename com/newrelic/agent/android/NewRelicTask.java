// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NewRelicTask.groovy

package com.newrelic.agent.android;

import com.sun.tools.attach.VirtualMachine;
import groovy.lang.*;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.*;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.*;
import org.gradle.api.internal.AbstractTask;
import org.gradle.api.internal.DynamicObject;
import org.gradle.api.internal.tasks.TaskExecuter;
import org.gradle.api.internal.tasks.TaskStateInternal;
import org.gradle.api.internal.tasks.execution.TaskValidator;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.LoggingManager;
import org.gradle.api.plugins.Convention;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.specs.Spec;
import org.gradle.api.tasks.*;
import org.gradle.internal.Factory;
import org.gradle.internal.service.ServiceRegistry;
import org.gradle.logging.StandardOutputCapture;

public class NewRelicTask extends DefaultTask
    implements GroovyObject
{

    public NewRelicTask()
    {
        Object obj;
        CallSite acallsite[] = $getCallSiteArray();
        obj = acallsite[0].call($get$$class$com$newrelic$agent$android$NewRelicGradlePlugin());
        (Logger)ScriptBytecodeAdapter.castToType(obj, $get$$class$org$gradle$api$logging$Logger());
        this;
        JVM INSTR swap ;
        logger;
        obj;
        MetaClass metaclass = $getStaticMetaClass();
        metaClass = metaclass;
        metaclass;
        return;
    }

    public Object getPid()
    {
        CallSite acallsite[] = $getCallSiteArray();
        String nameOfRunningVM = (String)ScriptBytecodeAdapter.castToType(acallsite[1].call(acallsite[2].call($get$$class$java$lang$management$ManagementFactory())), $get$$class$java$lang$String());
        String _tmp = nameOfRunningVM;
        int p = DefaultTypeTransformation.intUnbox(acallsite[3].call(nameOfRunningVM, "@"));
        int _tmp1 = p;
        return acallsite[4].call(nameOfRunningVM, (Integer)DefaultTypeTransformation.box(0), (Integer)DefaultTypeTransformation.box(p));
    }

    public Object getJarFilePath()
    {
        CallSite acallsite[] = $getCallSiteArray();
        String s;
        String jarFilePath = (String)ScriptBytecodeAdapter.castToType(acallsite[5].call(acallsite[6].call(acallsite[7].call(acallsite[8].call(acallsite[9].call($get$$class$com$newrelic$agent$compile$RewriterAgent()))))), $get$$class$java$lang$String());
        jarFilePath;
        Object obj = acallsite[10].call(acallsite[11].callConstructor($get$$class$java$io$File(), jarFilePath));
        jarFilePath = (String)ScriptBytecodeAdapter.castToType(obj, $get$$class$java$lang$String());
        obj;
        acallsite[12].call(logger, acallsite[13].call("[newrelic] Found New Relic instrumentation within ", jarFilePath));
        s = jarFilePath;
        URISyntaxException urisyntaxexception;
        IOException ioexception;
        try
        {
            return s;
        }
        // Misplaced declaration of an exception variable
        catch(URISyntaxException urisyntaxexception)
        {
            URISyntaxException e = (URISyntaxException)urisyntaxexception;
            acallsite[14].call(logger, "[newrelic] Unable to find New Relic instrumentation jar");
            throw (Throwable)acallsite[15].callConstructor($get$$class$java$lang$RuntimeException(), e);
        }
        // Misplaced declaration of an exception variable
        catch(IOException ioexception)
        {
            IOException e = (IOException)ioexception;
            acallsite[16].call(logger, "[newrelic] Unable to find New Relic instrumentation jar");
            throw (Throwable)acallsite[17].callConstructor($get$$class$java$lang$RuntimeException(), e);
        }
        Exception exception;
        exception;
        throw exception;
    }

    public Object injectAgent(String agentArgs)
    {
        CallSite acallsite[] = $getCallSiteArray();
        VirtualMachine vm = (VirtualMachine)null;
        if(__$stMC || BytecodeInterface8.disabledStandardMetaClass())
        {
            Object obj = attach g
            Object obj = acallsite[18].call($get$$class$com$sun$tools$attach$VirtualMachine(), acallsite[19].callCurrent(this));
            vm = (VirtualMachine)ScriptBytecodeAdapter.castToType(obj, $get$$class$com$sun$tools$attach$VirtualMachine());
            Object _tmp = obj;
        } else
        {
            Object obj1 = acallsite[20].call($get$$class$com$sun$tools$attach$VirtualMachine(), getPid());
            vm = (VirtualMachine)ScriptBytecodeAdapter.castToType(obj1, $get$$class$com$sun$tools$attach$VirtualMachine());
            Object _tmp1 = obj1;
        }
        if(__$stMC || BytecodeInterface8.disabledStandardMetaClass())
            acallsite[21].call(vm, acallsite[22].callCurrent(this), agentArgs);
        else
            acallsite[23].call(vm, getJarFilePath(), agentArgs);
        return acallsite[24].call(vm);
    }

    public Object this$dist$invoke$3(String name, Object args)
    {
        CallSite acallsite[] = $getCallSiteArray();
        return ScriptBytecodeAdapter.invokeMethodOnCurrentN($get$$class$com$newrelic$agent$android$NewRelicTask(), this, (String)ScriptBytecodeAdapter.castToType(new GStringImpl(new Object[] {
            name
        }, new String[] {
            "", ""
        }), $get$$class$java$lang$String()), ScriptBytecodeAdapter.despreadList(new Object[0], new Object[] {
            args
        }, new int[] {
            0
        }));
    }

    public void this$dist$set$3(String name, Object value)
    {
        CallSite acallsite[] = $getCallSiteArray();
        Object obj = value;
        ScriptBytecodeAdapter.setGroovyObjectField(obj, $get$$class$com$newrelic$agent$android$NewRelicTask(), this, (String)ScriptBytecodeAdapter.castToType(new GStringImpl(new Object[] {
            name
        }, new String[] {
            "", ""
        }), $get$$class$java$lang$String()));
        Object _tmp = obj;
    }

    public Object this$dist$get$3(String name)
    {
        CallSite acallsite[] = $getCallSiteArray();
        return ScriptBytecodeAdapter.getGroovyObjectField($get$$class$com$newrelic$agent$android$NewRelicTask(), this, (String)ScriptBytecodeAdapter.castToType(new GStringImpl(new Object[] {
            name
        }, new String[] {
            "", ""
        }), $get$$class$java$lang$String()));
    }

    protected MetaClass $getStaticMetaClass()
    {
        if(getClass() != $get$$class$com$newrelic$agent$android$NewRelicTask())
            return ScriptBytecodeAdapter.initMetaClass(this);
        ClassInfo classinfo = $staticClassInfo;
        if(classinfo == null)
            $staticClassInfo = classinfo = ClassInfo.getClassInfo(getClass());
        return classinfo.getMetaClass();
    }

    public MetaClass getMetaClass()
    {
        metaClass;
        if(metaClass == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        JVM INSTR pop ;
        metaClass = $getStaticMetaClass();
        return metaClass;
    }

    public void setMetaClass(MetaClass metaclass)
    {
        metaClass = metaclass;
    }

    public Object invokeMethod(String s, Object obj)
    {
        return getMetaClass().invokeMethod(this, s, obj);
    }

    public Object getProperty(String s)
    {
        return getMetaClass().getProperty(this, s);
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

    public int super$2$compareTo(Object obj)
    {
        return super.compareTo(obj);
    }

    public Task super$2$doFirst(Action action)
    {
        return super.doFirst(action);
    }

    public String super$2$toString()
    {
        return super.toString();
    }

    public boolean super$2$isEnabled()
    {
        return super.isEnabled();
    }

    public Task super$2$deleteAllActions()
    {
        return super.deleteAllActions();
    }

    public void super$2$setDescription(String s)
    {
        super.setDescription(s);
    }

    public void super$2$setDependsOn(Iterable iterable)
    {
        super.setDependsOn(iterable);
    }

    public void super$2$setProperty(String s, Object obj)
    {
        super.setProperty(s, obj);
    }

    public int super$2$compareTo(Task task)
    {
        return super.compareTo(task);
    }

    public void super$2$setProject(Project project)
    {
        super.setProject(project);
    }

    public Task super$2$doLast(Action action)
    {
        return super.doLast(action);
    }

    public String super$2$getPath()
    {
        return super.getPath();
    }

    public TaskDependency super$2$getTaskDependencies()
    {
        return super.getTaskDependencies();
    }

    public Task super$2$leftShift(Closure closure)
    {
        return super.leftShift(closure);
    }

    public TaskInputs super$2$getInputs()
    {
        return super.getInputs();
    }

    public void super$2$addValidator(TaskValidator taskvalidator)
    {
        super.addValidator(taskvalidator);
    }

    public void super$1$wait()
    {
        super.wait();
    }

    public void super$2$execute()
    {
        super.execute();
    }

    public Convention super$2$getConvention()
    {
        return super.getConvention();
    }

    public void super$2$executeWithoutThrowingTaskFailure()
    {
        super.executeWithoutThrowingTaskFailure();
    }

    public boolean super$2$getEnabled()
    {
        return super.getEnabled();
    }

    public boolean super$2$getDidWork()
    {
        return super.getDidWork();
    }

    public Class super$1$getClass()
    {
        return super.getClass();
    }

    public void super$2$onlyIf(Closure closure)
    {
        super.onlyIf(closure);
    }

    public Object super$2$configure(Closure closure)
    {
        return super.configure(closure);
    }

    public void super$2$setName(String s)
    {
        super.setName(s);
    }

    public String super$2$getDescription()
    {
        return super.getDescription();
    }

    public Set super$2$getDependsOn()
    {
        return super.getDependsOn();
    }

    public void super$2$setOnlyIf(Closure closure)
    {
        super.setOnlyIf(closure);
    }

    public List super$2$getValidators()
    {
        return super.getValidators();
    }

    public Task super$2$dependsOn(Object aobj[])
    {
        return super.dependsOn(aobj);
    }

    public Task super$2$doLast(Closure closure)
    {
        return super.doLast(closure);
    }

    public void super$2$setDidWork(boolean flag)
    {
        super.setDidWork(flag);
    }

    public DynamicObject super$2$getAsDynamicObject()
    {
        return super.getAsDynamicObject();
    }

    public List super$2$getTaskActions()
    {
        return super.getTaskActions();
    }

    public File super$2$getTemporaryDir()
    {
        return super.getTemporaryDir();
    }

    public void super$2$setEnabled(boolean flag)
    {
        super.setEnabled(flag);
    }

    public Factory super$2$getTemporaryDirFactory()
    {
        return super.getTemporaryDirFactory();
    }

    public int super$1$hashCode()
    {
        return super.hashCode();
    }

    public StandardOutputCapture super$2$getStandardOutputCapture()
    {
        return super.getStandardOutputCapture();
    }

    public TaskExecuter super$2$getExecuter()
    {
        return super.getExecuter();
    }

    public TaskState super$2$getState()
    {
        return super.getState();
    }

    public String super$2$getName()
    {
        return super.getName();
    }

    public TaskDependency super$2$getMustRunAfter()
    {
        return super.getMustRunAfter();
    }

    public Project super$2$getProject()
    {
        return super.getProject();
    }

    public void super$2$setExecuter(TaskExecuter taskexecuter)
    {
        super.setExecuter(taskexecuter);
    }

    public void super$1$notify()
    {
        super.notify();
    }

    public Logger super$2$getLogger()
    {
        return super.getLogger();
    }

    public void super$1$notifyAll()
    {
        super.notifyAll();
    }

    public TaskOutputs super$2$getOutputs()
    {
        return super.getOutputs();
    }

    public void super$2$setFinalizedBy(Iterable iterable)
    {
        super.setFinalizedBy(iterable);
    }

    public TaskStateInternal super$2$getStateInternal()
    {
        return super.getStateInternal();
    }

    public AntBuilder super$2$getAnt()
    {
        return super.getAnt();
    }

    public Spec super$2$getOnlyIf()
    {
        return super.getOnlyIf();
    }

    public List super$2$getActions()
    {
        return super.getActions();
    }

    public void super$2$setGroup(String s)
    {
        super.setGroup(s);
    }

    public Object super$1$clone()
    {
        return super.clone();
    }

    public LoggingManager super$2$getLogging()
    {
        return super.getLogging();
    }

    public void super$2$setOnlyIf(Spec spec)
    {
        super.setOnlyIf(spec);
    }

    public Task super$2$mustRunAfter(Object aobj[])
    {
        return super.mustRunAfter(aobj);
    }

    public void super$1$wait(long l, int i)
    {
        super.wait(l, i);
    }

    public String super$2$getGroup()
    {
        return super.getGroup();
    }

    public ExtensionContainer super$2$getExtensions()
    {
        return super.getExtensions();
    }

    public ServiceRegistry super$2$getServices()
    {
        return super.getServices();
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

    public void super$1$finalize()
    {
        super.finalize();
    }

    public void super$2$setActions(List list)
    {
        super.setActions(list);
    }

    public boolean super$2$dependsOnTaskDidWork()
    {
        return super.dependsOnTaskDidWork();
    }

    public void super$1$wait(long l)
    {
        super.wait(l);
    }

    public Task super$2$finalizedBy(Object aobj[])
    {
        return super.finalizedBy(aobj);
    }

    public Object super$2$property(String s)
    {
        return super.property(s);
    }

    public TaskDependency super$2$getFinalizedBy()
    {
        return super.getFinalizedBy();
    }

    public boolean super$1$equals(Object obj)
    {
        return super.equals(obj);
    }

    private static void $createCallSiteArray_1(String as[])
    {
        as[0] = "getLogger";
        as[1] = "getName";
        as[2] = "getRuntimeMXBean";
        as[3] = "indexOf";
        as[4] = "substring";
        as[5] = "getPath";
        as[6] = "toURI";
        as[7] = "getLocation";
        as[8] = "getCodeSource";
        as[9] = "getProtectionDomain";
        as[10] = "getCanonicalPath";
        as[11] = "<$constructor$>";
        as[12] = "info";
        as[13] = "plus";
        as[14] = "error";
        as[15] = "<$constructor$>";
        as[16] = "error";
        as[17] = "<$constructor$>";
        as[18] = "attach";
        as[19] = "getPid";
        as[20] = "attach";
        as[21] = "loadAgent";
        as[22] = "getJarFilePath";
        as[23] = "loadAgent";
        as[24] = "detach";
    }

    private static CallSiteArray $createCallSiteArray()
    {
        String as[] = new String[25];
        $createCallSiteArray_1(as);
        return new CallSiteArray($get$$class$com$newrelic$agent$android$NewRelicTask(), as);
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

    private static Class $get$$class$com$newrelic$agent$compile$RewriterAgent()
    {
        return $class$com$newrelic$agent$compile$RewriterAgent == null && ($class$com$newrelic$agent$compile$RewriterAgent = _mthclass$("com.newrelic.agent.compile.RewriterAgent")) == null ? $class$com$newrelic$agent$compile$RewriterAgent : $class$com$newrelic$agent$compile$RewriterAgent;
    }

    private static Class $get$$class$java$lang$RuntimeException()
    {
        return $class$java$lang$RuntimeException == null && ($class$java$lang$RuntimeException = _mthclass$("java.lang.RuntimeException")) == null ? $class$java$lang$RuntimeException : $class$java$lang$RuntimeException;
    }

    private static Class $get$$class$com$newrelic$agent$android$NewRelicGradlePlugin()
    {
        return $class$com$newrelic$agent$android$NewRelicGradlePlugin == null && ($class$com$newrelic$agent$android$NewRelicGradlePlugin = _mthclass$("com.newrelic.agent.android.NewRelicGradlePlugin")) == null ? $class$com$newrelic$agent$android$NewRelicGradlePlugin : $class$com$newrelic$agent$android$NewRelicGradlePlugin;
    }

    private static Class $get$$class$com$newrelic$agent$android$NewRelicTask()
    {
        return $class$com$newrelic$agent$android$NewRelicTask == null && ($class$com$newrelic$agent$android$NewRelicTask = _mthclass$("com.newrelic.agent.android.NewRelicTask")) == null ? $class$com$newrelic$agent$android$NewRelicTask : $class$com$newrelic$agent$android$NewRelicTask;
    }

    private static Class $get$$class$org$gradle$api$logging$Logger()
    {
        return $class$org$gradle$api$logging$Logger == null && ($class$org$gradle$api$logging$Logger = _mthclass$("org.gradle.api.logging.Logger")) == null ? $class$org$gradle$api$logging$Logger : $class$org$gradle$api$logging$Logger;
    }

    private static Class $get$$class$java$lang$management$ManagementFactory()
    {
        return $class$java$lang$management$ManagementFactory == null && ($class$java$lang$management$ManagementFactory = _mthclass$("java.lang.management.ManagementFactory")) == null ? $class$java$lang$management$ManagementFactory : $class$java$lang$management$ManagementFactory;
    }

    private static Class $get$$class$java$lang$String()
    {
        return $class$java$lang$String == null && ($class$java$lang$String = _mthclass$("java.lang.String")) == null ? $class$java$lang$String : $class$java$lang$String;
    }

    private static Class $get$$class$java$io$File()
    {
        return $class$java$io$File == null && ($class$java$io$File = _mthclass$("java.io.File")) == null ? $class$java$io$File : $class$java$io$File;
    }

    private static Class $get$$class$com$sun$tools$attach$VirtualMachine()
    {
        return $class$com$sun$tools$attach$VirtualMachine == null && ($class$com$sun$tools$attach$VirtualMachine = _mthclass$("com.sun.tools.attach.VirtualMachine")) == null ? $class$com$sun$tools$attach$VirtualMachine : $class$com$sun$tools$attach$VirtualMachine;
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

    protected Logger logger;
    private static ClassInfo $staticClassInfo;
    public static transient boolean __$stMC;
    private transient MetaClass metaClass;
    public static long __timeStamp;
    public static long __timeStamp__239_neverHappen1416597642118;
    private static SoftReference $callSiteArray;
    private static Class $class$com$newrelic$agent$compile$RewriterAgent;
    private static Class $class$java$lang$RuntimeException;
    private static Class $class$com$newrelic$agent$android$NewRelicGradlePlugin;
    private static Class $class$com$newrelic$agent$android$NewRelicTask;
    private static Class $class$org$gradle$api$logging$Logger;
    private static Class $class$java$lang$management$ManagementFactory;
    private static Class $class$java$lang$String;
    private static Class $class$java$io$File;
    private static Class $class$com$sun$tools$attach$VirtualMachine;

    static 
    {
        __$swapInit();
        Long long1 = (Long)DefaultTypeTransformation.box(0L);
        __timeStamp__239_neverHappen1416597642118 = long1.longValue();
        Long _tmp = long1;
        Long long2 = (Long)DefaultTypeTransformation.box(0x149d3cc9b86L);
        __timeStamp = long2.longValue();
        Long _tmp1 = long2;
    }
}
