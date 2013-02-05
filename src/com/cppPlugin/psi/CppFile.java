package com.cppPlugin.psi;

import com.cppPlugin.CPPLanguage;
import com.cppPlugin.CppFileType;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: matthewsullivan
 * Date: 30/01/2013
 * Time: 09:37
 * To change this template use File | Settings | File Templates.
 */
public class CppFile extends PsiFileBase {
    public CppFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CPPLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType(){
        return CppFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "CPP File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
