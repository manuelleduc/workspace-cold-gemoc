package fr.mleduc.tests

import com.google.inject.Inject
import java.io.IOException
import java.io.InputStream
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.common.util.WrappedException
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.resource.IResourceFactory

class SmartParseHelper<T extends EObject> extends ParseHelper<T> {

	@Inject
	IResourceFactory resourceFactory;

	def T parse(CharSequence text, ResourceSet resourceSetToUse, String fileExtension) throws Exception {
		return parse(getAsStream(text), computeUnusedUri(resourceSetToUse, fileExtension), null, resourceSetToUse,
			fileExtension) as T
	}

	def URI computeUnusedUri(ResourceSet resourceSet, String fileExtension) {
		val String name = "__synthetic";
		for (i : 0 .. Integer.MAX_VALUE) {
			val URI syntheticUri = URI.createURI(name + i + "." + fileExtension);
			if (resourceSet.getResource(syntheticUri, false) == null)
				return syntheticUri;
		}
		throw new IllegalStateException();
	}

	def T parse(InputStream in, URI uriToUse, Map<?, ?> options, ResourceSet resourceSet, String fileExtension) {
		val resource = resourceSet.createResource(uriToUse);
		try {
			resource.load(in, options);
			val T root = if(resource.getContents().isEmpty()) null else resource.getContents().get(0) as T;
			return root;
		} catch (IOException e) {
			throw new WrappedException(e);
		}

	}

}
