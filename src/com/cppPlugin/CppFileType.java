package com.cppPlugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: matthewsullivan
 * Date: 28/01/2013
 * Time: 19:16
 * To change this template use File | Settings | File Templates.
 */
public class CppFileType extends LanguageFileType {
    public static final CppFileType INSTANCE = new CppFileType();

    private CppFileType() {
        super(CPPLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Simple file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Simple language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cpp";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CppIcons.File;
    }

}
