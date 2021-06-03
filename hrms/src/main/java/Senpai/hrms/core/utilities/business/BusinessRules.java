package Senpai.hrms.core.utilities.business;

import Senpai.hrms.core.utilities.results.Result;

public class BusinessRules {

	public static Result Run(Result... results)
    {
		for (Result result : results) {
			 if (!result.isSuccess())
            {
                return result;
            }
		}
       
        return null;
    }
}
