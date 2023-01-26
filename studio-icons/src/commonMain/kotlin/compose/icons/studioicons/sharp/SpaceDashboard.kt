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

public val SharpGroup.SpaceDashboard: ImageVector
    get() {
        if (_spaceDashboard != null) {
            return _spaceDashboard!!
        }
        _spaceDashboard = Builder(name = "SpaceDashboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(13.0f, 21.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(21.0f, 10.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _spaceDashboard!!
    }

private var _spaceDashboard: ImageVector? = null
