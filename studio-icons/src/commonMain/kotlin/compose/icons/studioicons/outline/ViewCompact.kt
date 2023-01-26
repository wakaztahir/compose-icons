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

public val OutlineGroup.ViewCompact: ImageVector
    get() {
        if (_viewCompact != null) {
            return _viewCompact!!
        }
        _viewCompact = Builder(name = "ViewCompact", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(6.5f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(18.0f)
                close()
                moveTo(6.5f, 13.25f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(13.25f)
                close()
                moveTo(6.5f, 8.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(11.0f, 18.0f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(11.0f, 13.25f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.25f)
                close()
                moveTo(11.0f, 8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.5f)
                close()
                moveTo(15.5f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(18.0f)
                close()
                moveTo(15.5f, 13.25f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(13.25f)
                close()
                moveTo(15.5f, 8.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(20.0f, 13.25f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.25f)
                close()
                moveTo(20.0f, 8.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _viewCompact!!
    }

private var _viewCompact: ImageVector? = null
