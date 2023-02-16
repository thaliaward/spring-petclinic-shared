/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Juergen Hoeller
 * @author Ken Krebs
 * @author Arjen Poutsma
 * @author Michael Isvy
 */
@Controller
class PetSearchController {

	@GetMapping("/pets/find")
	public String processFindForm(@RequestParam(defaultValue = "1") int page, Owner owner, BindingResult result,
			Model model) {
		// // allow parameterless GET request for /owners to return all records
		// if (owner.getLastName() == null) {
		// owner.setLastName(""); // empty string signifies broadest possible search
		// }
		//
		// // find owners by last name
		// Page<Owner> ownersResults = findPaginatedForOwnersLastName(page,
		// owner.getLastName());
		// if (ownersResults.isEmpty()) {
		// // no owners found
		// result.rejectValue("lastName", "notFound", "not found");
		// return "owners/findOwners";
		// }
		//
		// if (ownersResults.getTotalElements() == 1) {
		// // 1 owner found
		// owner = ownersResults.iterator().next();
		// return "redirect:/owners/" + owner.getId();
		// }
		//
		// // multiple owners found
		// return addPaginationModel(page, model, ownersResults);
		return "pets/findPets";
	}

}
