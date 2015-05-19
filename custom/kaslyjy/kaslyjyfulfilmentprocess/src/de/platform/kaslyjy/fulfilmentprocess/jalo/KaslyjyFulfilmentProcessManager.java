/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.platform.kaslyjy.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.platform.kaslyjy.fulfilmentprocess.constants.KaslyjyFulfilmentProcessConstants;

import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class KaslyjyFulfilmentProcessManager extends GeneratedKaslyjyFulfilmentProcessManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( KaslyjyFulfilmentProcessManager.class.getName() );
	
	public static final KaslyjyFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (KaslyjyFulfilmentProcessManager) em.getExtension(KaslyjyFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
