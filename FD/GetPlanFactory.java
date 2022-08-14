package com.org.tav.FD;

public class GetPlanFactory {
	public Plan getPlan(String Plantype)
	{
		if(Plantype==null) {
			return null;
		}
		if(Plantype.equalsIgnoreCase("dom")) {
			return new DomesticPlan();
		}
		if(Plantype.equalsIgnoreCase("comm")) {
			return new CommercialPlan();
		}
		if(Plantype.equalsIgnoreCase("ins")) {
			return new InstitutionPlan();
		}
		return null;
	}
}
