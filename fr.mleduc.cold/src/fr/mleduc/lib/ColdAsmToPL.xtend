package fr.mleduc.lib

import fr.mleduc.lib.pl.model.Operator
import com.google.inject.Inject
import fr.mleduc.coldLang.OneOf
import fr.mleduc.coldLang.SomeOf

class ColdAsmToPL {
	
	@Inject extension PropositionCache
	@Inject extension PLLib
	@Inject extension FPLib
	
//	def dispatch Operator variabilityToPL(Feature that) {
//		// activating the feature imply having all the attached facets activated.
//		that.coldfacets.map[that.proposition.equivalent(it.proposition)].fold1([ Operator p1, p2|p1.and(p2)], new True)
//	}
	
	def dispatch  Operator variabilityToPL(OneOf that) {
//		val subs = that.coldvmfeaturedefinition
		
//		val ret = newArrayList
//		for(var i=0; i<subs.length; i++) {
//			val innerL = newArrayList()
//			
//			for(var j=0; j<subs.length; j++) {
//				if(i!=j) {
//					innerL.add(subs.get(j).proposition.not)
//				} else {
//					innerL.add(subs.get(j).proposition)
//				}
//				
//			}
//			
//			// !a&&!b&...&c
//			ret.add(innerL.fold1([Operator p1, p2|p1.and(p2)], new True))
//		}
		
		
		// child-parent relations
//		val childParent = subs.map[it.proposition.imply(that.proposition)].fold1([ Operator p1,p2|p1.and(p2)], new True)
		// xor-group
//		val xorGroup = that.proposition.imply(ret.fold1([Operator p1, p2|p1.or(p2)], new True))
		// subcild proposition
//		val subPropositions = subs.map[it.variabilityToPL].fold1([ Operator p1,p2|p1.and(p2)], new True)
		
//		childParent.and(xorGroup).and(subPropositions)
		
	}
	
	def dispatch Operator  variabilityToPL(SomeOf that) {
//		val subs = that.coldvmfeaturedefinition
//			
//		val subPropositions = subs.map[it.variabilityToPL].fold1([ Operator p1,p2|p1.and(p2)], new True)
//		
//		// all the subfeature can be freely selected, except the mandatory (non optional) one that should be selected as soon as the someOf feature is selected  
//		that.coldvmfeaturedefinition.map[
//			if(it.optional)
//				it.proposition.imply(that.proposition)
//			else 
//				it.proposition.equivalent(that.proposition)
//		].fold1([Operator p1, p2|p1.and(p2)], new True).and(subPropositions)
//		
		
	} 
	
//	def coldAsmToPL(ColdImport ci) {
//		
//			val concern = ci.coldroot
//			
//			// at this point we have modelized all the dependencies between concern artifacts and facets.
//			
//			val variability = concern.variability as ColdVM
//			
//			val rootp = variability.proposition
//			
//			val vm = variability.coldvmfeaturedefinition.map[
//				(if(it.optional) it.proposition.imply(rootp) else it.proposition.equivalent(rootp)).and(it.variabilityToPL)
//			].fold1([Operator p1, p2|p1.and(p2)] , new True)
//			
//			
//			val r = vm 
//
//			val withSelectedFeatures = if(ci.coldselectedfeatures.empty) r else ci.coldselectedfeatures.map[it.feature.proposition.equivalent(new True)]
//				.fold1([Operator p1, p2| p1.and(p2)], new True).and(r)
//			val tmp = withSelectedFeatures.and(rootp.equivalent(new True))
//			
//			
//			val ret = new ToTweety {}.$(tmp)
//			
//			println(new PrettyPrint {}.$(tmp).print(6L))
//			
//			ret
//	}
}