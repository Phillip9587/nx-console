package dev.nx.console.nxls.server

import dev.nx.console.models.*
import dev.nx.console.nxls.server.requests.*
import java.util.concurrent.CompletableFuture
import org.eclipse.lsp4j.jsonrpc.services.JsonNotification
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest
import org.eclipse.lsp4j.jsonrpc.services.JsonSegment

@JsonSegment("nx")
interface NxService {

    @JsonRequest
    fun workspace(
        workspaceRequest: NxWorkspaceRequest = NxWorkspaceRequest()
    ): CompletableFuture<NxWorkspace> {
        throw UnsupportedOperationException()
    }

    @JsonRequest
    fun generators(
        generatorsRequest: NxGeneratorsRequest = NxGeneratorsRequest()
    ): CompletableFuture<List<NxGenerator>> {
        throw UnsupportedOperationException()
    }

    @JsonRequest
    fun generatorOptions(
        generatorOptionsRequest: NxGeneratorOptionsRequest
    ): CompletableFuture<List<NxGeneratorOption>> {
        throw UnsupportedOperationException()
    }

    @JsonRequest
    fun generatorContextFromPath(
        generatorContextFromPathRequest: NxGetGeneratorContextFromPathRequest
    ): CompletableFuture<NxGeneratorContext> {
        throw UnsupportedOperationException()
    }

    @JsonRequest
    fun projectGraphOutput(): CompletableFuture<ProjectGraphOutput> {
        throw UnsupportedOperationException()
    }

    @JsonRequest
    fun createProjectGraph(): CompletableFuture<String?> {
        throw UnsupportedOperationException()
    }

    @JsonRequest
    fun projectFolderTree(): CompletableFuture<SerializedNxFolderTreeData> {
        throw UnsupportedOperationException()
    }
    @JsonNotification
    fun changeWorkspace(workspacePath: String) {
        throw UnsupportedOperationException()
    }

    @JsonNotification
    fun refreshWorkspace() {
        throw UnsupportedOperationException()
    }
}
