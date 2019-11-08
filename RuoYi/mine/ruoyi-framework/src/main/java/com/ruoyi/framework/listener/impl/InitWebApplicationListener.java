/**
 * Copyright (c) 2019, Stupid Bird and/or its affiliates. All rights reserved.
 * STUPID BIRD PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @Project : ruoyi
 * @Package : com.ruoyi.framework.listener.impl
 * @author <a href="http://www.lizhaoweb.net">李召(John.Lee)</a>
 * @EMAIL 404644381@qq.com
 * @Time : 19:38
 */
package com.ruoyi.framework.listener.impl;

import com.ruoyi.common.config.Global;
import com.ruoyi.common.utils.MessageUtils;
import com.ruoyi.framework.listener.AbstractListener;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;

/**
 * <h1>监听器 - 初始化应用</h1>
 *
 * @author <a href="http://www.lizhaoweb.cn">李召(John.Lee)</a>
 * @version 1.0.0.0.1
 * @notes Created on 2016年12月06日<br>
 * Revision of last commit:$Revision$<br>
 * Author of last commit:$Author$<br>
 * Date of last commit:$Date$<br>
 */
@Component
public class InitWebApplicationListener extends AbstractListener {

    /**
     * 初始化应用
     *
     * @param servletContext 应用上下文
     */
    @Override
    protected void onApplicationLoad(ServletContext servletContext) {
        int labelCharacterCount = 35;
        logger.info("/=================================== Initialize Application ====================================\\");
        String localProjectName = MessageUtils.message("project.name.local", "");
        servletContext.setAttribute("LocalName", localProjectName);
        logger.info("{}: {}", StringUtils.rightPad("Application Name [Local]", labelCharacterCount), localProjectName);

        String englishProjectName = Global.getName();
        servletContext.setAttribute("EnglishName", englishProjectName);
        logger.info("{}: {}", StringUtils.rightPad("Application Name [English]", labelCharacterCount), englishProjectName);

        String version = Global.getVersion();
        servletContext.setAttribute("Version", version);
        logger.info("{}: {}", StringUtils.rightPad("Application Version", labelCharacterCount), version);

        String copyrightYear = Global.getCopyrightYear();
        servletContext.setAttribute("CopyrightYear", copyrightYear);
        logger.info("{}: {}", StringUtils.rightPad("Application Copyright Year", labelCharacterCount), copyrightYear);

        String faviconIcon = MessageUtils.message("project.icon.favicon", "");
        servletContext.setAttribute("FaviconIcon", faviconIcon);
        logger.info("{}: {}", StringUtils.rightPad("Application Favicon Icon", labelCharacterCount), faviconIcon);

        String loginLogo = MessageUtils.message("project.logo.login", "");
        servletContext.setAttribute("LoginLogo", loginLogo);
        logger.info("{}: {}", StringUtils.rightPad("Application Login Logo", labelCharacterCount), loginLogo);

        String profile = Global.getProfile();
        servletContext.setAttribute("Profile", profile);
        logger.info("{}: {}", StringUtils.rightPad("Application Profile", labelCharacterCount), profile);

        String demoEnabled = Global.isDemoEnabled();
        servletContext.setAttribute("DemoEnabled", localProjectName);
        logger.info("{}: {}", StringUtils.rightPad("Application Demo Enabled", labelCharacterCount), demoEnabled);

        Boolean addressEnabled = Global.isAddressEnabled();
        servletContext.setAttribute("IPAddressEnabled", addressEnabled);
        logger.info("{}: {}", StringUtils.rightPad("Application IP-Address Enabled", labelCharacterCount), addressEnabled);

        logger.info("\\==================================== Initialize Application =====================================/");
    }
}
