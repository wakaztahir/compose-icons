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

public val OutlineGroup.DriveFileMoveRtl: ImageVector
    get() {
        if (_driveFileMoveRtl != null) {
            return _driveFileMoveRtl!!
        }
        _driveFileMoveRtl = Builder(name = "DriveFileMoveRtl", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(5.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(13.41f, 15.59f)
                lineTo(12.0f, 17.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(1.41f, 1.41f)
                lineTo(11.83f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.17f)
                lineTo(13.41f, 15.59f)
                close()
            }
        }
        .build()
        return _driveFileMoveRtl!!
    }

private var _driveFileMoveRtl: ImageVector? = null
