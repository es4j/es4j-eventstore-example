package org.es4j.eventstore.example;

import org.es4j.dotnet.GC;
import org.es4j.eventstore.api.Commit;
import org.es4j.eventstore.api.IPipelineHook;
//import org.es4j.eventstore.core.dotnet.GC;


public class AuthorizationPipelineHook implements IPipelineHook {

    public AuthorizationPipelineHook() {
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }    
    @Override
    public void dispose() {
        this.dispose(true);
        GC.suppressFinalize(this);
    }
    
    protected void dispose(boolean disposing) {
        // no op
    }

    @Override
    public Commit select(Commit committed) {
        // return null if the user isn't authorized to see this commit
        return committed;
    }
    
    @Override
    public boolean preCommit(Commit attempt) {
        // Can easily do logging or other such activities here
        return true; // true == allow commit to continue, false = stop.
    }
    
    @Override
    public void postCommit(Commit committed) {
        // anything to do after the commit has been persisted.
    }

}
