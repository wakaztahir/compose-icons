package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.GitPullRequestFill: ImageVector
    get() {
        if (_gitPullRequestFill != null) {
            return _gitPullRequestFill!!
        }
        _gitPullRequestFill = Builder(name = "GitPullRequestFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.17f)
                arcToRelative(3.001f, 3.001f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(-4.5f, -4.0f)
                lineTo(15.0f, 2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.0f, 8.83f)
                arcToRelative(3.001f, 3.001f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(6.34f)
                arcToRelative(3.001f, 3.001f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineTo(8.83f)
                close()
            }
        }
        .build()
        return _gitPullRequestFill!!
    }

private var _gitPullRequestFill: ImageVector? = null
