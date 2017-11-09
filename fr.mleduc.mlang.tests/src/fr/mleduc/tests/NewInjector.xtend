package fr.mleduc.tests

class NewInjector extends MMLangInjectorProvider {

	override protected internalCreateInjector() {
		new MLangInjectorProvider().getInjector()
		return super.internalCreateInjector()
	}

}
