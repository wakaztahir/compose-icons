package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ChatDismiss: ImageVector
    get() {
        if (_chatDismiss != null) {
            return _chatDismiss!!
        }
        _chatDismiss = Builder(name = "ChatDismiss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 13.6203f, 2.3864f, 15.186f, 3.1146f, 16.5922f)
                lineTo(2.047f, 20.4151f)
                curveTo(1.9855f, 20.6349f, 1.9855f, 20.8676f, 2.0469f, 21.0876f)
                curveTo(2.2326f, 21.7525f, 2.9221f, 22.141f, 3.587f, 21.9553f)
                lineTo(7.4129f, 20.888f)
                curveTo(8.8178f, 21.6146f, 10.3817f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                close()
                moveTo(9.2803f, 8.2197f)
                lineTo(12.0f, 10.9393f)
                lineTo(14.7197f, 8.2197f)
                curveTo(15.0126f, 7.9268f, 15.4874f, 7.9268f, 15.7803f, 8.2197f)
                curveTo(16.0732f, 8.5126f, 16.0732f, 8.9874f, 15.7803f, 9.2803f)
                lineTo(13.0607f, 12.0f)
                lineTo(15.7803f, 14.7197f)
                curveTo(16.0732f, 15.0126f, 16.0732f, 15.4874f, 15.7803f, 15.7803f)
                curveTo(15.4874f, 16.0732f, 15.0126f, 16.0732f, 14.7197f, 15.7803f)
                lineTo(12.0f, 13.0607f)
                lineTo(9.2803f, 15.7803f)
                curveTo(8.9874f, 16.0732f, 8.5126f, 16.0732f, 8.2197f, 15.7803f)
                curveTo(7.9268f, 15.4874f, 7.9268f, 15.0126f, 8.2197f, 14.7197f)
                lineTo(10.9393f, 12.0f)
                lineTo(8.2197f, 9.2803f)
                curveTo(7.9268f, 8.9874f, 7.9268f, 8.5126f, 8.2197f, 8.2197f)
                curveTo(8.5126f, 7.9268f, 8.9874f, 7.9268f, 9.2803f, 8.2197f)
                close()
            }
        }
        .build()
        return _chatDismiss!!
    }

private var _chatDismiss: ImageVector? = null