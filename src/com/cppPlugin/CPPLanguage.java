/**
 * Created with IntelliJ IDEA.
 * User: matthewsullivan
 * Date: 28/01/2013
 * Time: 14:04
 * To change this template use File | Settings | File Templates.
 */

package com.cppPlugin;

import com.intellij.lang.Language;

public class CPPLanguage extends Language {
    public static final CPPLanguage INSTANCE = new CPPLanguage();

    private CPPLanguage() {
        super("CPP");
    }
}
