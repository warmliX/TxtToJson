import kotlinx.serialization.Serializable

@Serializable
data class Content (
    val id: String?,
    val transcription: String?,
    val report: String?
)
