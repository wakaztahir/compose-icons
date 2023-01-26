package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.VideoStable: ImageVector
    get() {
        if (_videoStable != null) {
            return _videoStable!!
        }
        _videoStable = Builder(name = "VideoStable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                close()
                moveTo(4.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.95f)
                lineToRelative(-2.33f, 8.73f)
                lineTo(16.82f, 18.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(15.62f, 15.61f)
                lineToRelative(-8.55f, -2.29f)
                lineToRelative(1.31f, -4.92f)
                lineToRelative(8.56f, 2.29f)
                lineTo(15.62f, 15.61f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-2.95f)
                lineToRelative(2.34f, -8.73f)
                lineTo(7.18f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _videoStable!!
    }

private var _videoStable: ImageVector? = null