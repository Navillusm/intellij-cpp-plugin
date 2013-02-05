package com.cppPlugin;

import com.apple.jobjc.foundation.NSNull;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: matthewsullivan
 * Date: 28/01/2013
 * Time: 21:25
 * To change this template use File | Settings | File Templates.
 */
public class CppElementType extends IElementType {
    public CppElementType(@NotNull @NonNls String debugName) {
        super(debugName, CPPLanguage.INSTANCE);
    }
}
