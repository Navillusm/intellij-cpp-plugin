package com.cppPlugin;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: matthewsullivan
 * Date: 28/01/2013
 * Time: 19:20
 * To change this template use File | Settings | File Templates.
 */
public class CPPFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(CppFileType.INSTANCE, "cpp");
    }
}
