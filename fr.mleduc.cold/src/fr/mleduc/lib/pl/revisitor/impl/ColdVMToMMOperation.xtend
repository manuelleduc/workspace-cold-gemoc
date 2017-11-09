package fr.mleduc.lib.pl.revisitor.impl

import fr.mleduc.lib.PropositionCache

interface ColdVMToMMOperation<A> {
	def A produce(PropositionCache cache)
}
