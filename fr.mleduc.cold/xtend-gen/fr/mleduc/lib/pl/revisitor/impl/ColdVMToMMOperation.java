package fr.mleduc.lib.pl.revisitor.impl;

import fr.mleduc.lib.PropositionCache;

@SuppressWarnings("all")
public interface ColdVMToMMOperation<A extends Object> {
  public abstract A produce(final PropositionCache cache);
}
