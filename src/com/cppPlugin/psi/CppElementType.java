package com.cppPlugin.psi;

import com.cppPlugin.CPPLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: matthewsullivan
 * Date: 29/01/2013
 * Time: 10:06
 * To change this template use File | Settings | File Templates.
 */
public class CppElementType extends IElementType {
    public CppElementType(@NotNull @NonNls String debugName) {
        super(debugName, CPPLanguage.INSTANCE);
    }
}
