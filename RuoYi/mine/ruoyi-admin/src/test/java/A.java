/**
 * Copyright (c) 2019, Stupid Bird and/or its affiliates. All rights reserved.
 * STUPID BIRD PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @Project : ruoyi
 * @Package : PACKAGE_NAME
 * @author <a href="http://www.lizhaoweb.net">李召(John.Lee)</a>
 * @EMAIL 404644381@qq.com
 * @Time : 12:00
 */

import org.apache.shiro.codec.Base64;

import java.nio.charset.Charset;

/**
 * @author <a href="http://www.lizhaoweb.cn">李召(John.Lee)</a>
 * @version 1.0.0.0.1
 * @EMAIL 404644381@qq.com
 * @notes Created on 2019年11月05日<br>
 * Revision of last commit:$Revision$<br>
 * Author of last commit:$Author$<br>
 * Date of last commit:$Date$<br>
 */
public class A {
    public static void main(String[] args) {
        try {
            byte[] aaa = Base64.decode("fCq+/xW488hMTCD+cmJ3aQ==");
            System.out.println(new String(aaa, Charset.forName("iso-8859-1")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
