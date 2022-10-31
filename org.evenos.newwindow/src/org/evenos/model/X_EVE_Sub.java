/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.evenos.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for EVE_Sub
 *  @author iDempiere (generated) 
 *  @version Release 9 - $Id$ */
@org.adempiere.base.Model(table="EVE_Sub")
public class X_EVE_Sub extends PO implements I_EVE_Sub, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20221031L;

    /** Standard Constructor */
    public X_EVE_Sub (Properties ctx, int EVE_Sub_ID, String trxName)
    {
      super (ctx, EVE_Sub_ID, trxName);
      /** if (EVE_Sub_ID == 0)
        {
			setEVE_Main_ID (0);
			setEVE_Sub_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_EVE_Sub (Properties ctx, int EVE_Sub_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, EVE_Sub_ID, trxName, virtualColumns);
      /** if (EVE_Sub_ID == 0)
        {
			setEVE_Main_ID (0);
			setEVE_Sub_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_EVE_Sub (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_EVE_Sub[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	public I_EVE_Main getEVE_Main() throws RuntimeException
	{
		return (I_EVE_Main)MTable.get(getCtx(), I_EVE_Main.Table_ID)
			.getPO(getEVE_Main_ID(), get_TrxName());
	}

	/** Set Evenos Main.
		@param EVE_Main_ID Evenos Main
	*/
	public void setEVE_Main_ID (int EVE_Main_ID)
	{
		if (EVE_Main_ID < 1)
			set_ValueNoCheck (COLUMNNAME_EVE_Main_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_EVE_Main_ID, Integer.valueOf(EVE_Main_ID));
	}

	/** Get Evenos Main.
		@return Evenos Main	  */
	public int getEVE_Main_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EVE_Main_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Evenos Sub.
		@param EVE_Sub_ID Evenos Sub
	*/
	public void setEVE_Sub_ID (int EVE_Sub_ID)
	{
		if (EVE_Sub_ID < 1)
			set_ValueNoCheck (COLUMNNAME_EVE_Sub_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_EVE_Sub_ID, Integer.valueOf(EVE_Sub_ID));
	}

	/** Get Evenos Sub.
		@return Evenos Sub	  */
	public int getEVE_Sub_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EVE_Sub_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set EVE_Sub_UU.
		@param EVE_Sub_UU EVE_Sub_UU
	*/
	public void setEVE_Sub_UU (String EVE_Sub_UU)
	{
		set_ValueNoCheck (COLUMNNAME_EVE_Sub_UU, EVE_Sub_UU);
	}

	/** Get EVE_Sub_UU.
		@return EVE_Sub_UU	  */
	public String getEVE_Sub_UU()
	{
		return (String)get_Value(COLUMNNAME_EVE_Sub_UU);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}