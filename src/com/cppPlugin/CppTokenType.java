package com.cppPlugin;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: matthewsullivan
 * Date: 28/01/2013
 * Time: 21:21
 * To change this template use File | Settings | File Templates.
 */
public class CppTokenType extends IElementType {
    public CppTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CPPLanguage.INSTANCE);
    }
    @Override
    public String toString() {
        return "CppTokenType." + super.toString();
    }
}
