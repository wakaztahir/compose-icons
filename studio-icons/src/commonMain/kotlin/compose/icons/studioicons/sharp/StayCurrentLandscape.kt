package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.StayCurrentLandscape: ImageVector
    get() {
        if (_stayCurrentLandscape != null) {
            return _stayCurrentLandscape!!
        }
        _stayCurrentLandscape = Builder(name = "StayCurrentLandscape", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 19.0f)
                horizontalLineToRelative(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(19.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _stayCurrentLandscape!!
    }

private var _stayCurrentLandscape: ImageVector? = null